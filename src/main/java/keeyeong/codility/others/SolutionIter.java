package keeyeong.codility.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SolutionIter implements Iterable<Integer> {

	/**
	 * Example usage:
	 *
	 * for (Integer x : new SolutionIter(reader)) { System.out.println(x); }
	 */

	BufferedReader br;

	public SolutionIter(Reader inp) {
		this.br = new BufferedReader(inp);
	}

	@Override
	public Iterator<Integer> iterator() {

		return new Iterator<Integer>() {

			Integer nextItem = null; // the item to return for the next next()
										// call
			boolean ready = false; // flag to indicate nextItem is loaded and
									// ready for next()

			@Override
			public boolean hasNext() {
				// for storing read line from the buffer
				String currentLine;
				// if we already has a ready line (from a previous hasNext()
				// call), do nothing and return true
				if (this.ready) {
					return true;
				} else {
					// else try to read from buffer a valid value, then set the
					// ready flag and nextItem and return true
					try {
						while ((currentLine = br.readLine()) != null) {
							try {
								String s = currentLine.trim();
								Integer I = Integer.parseInt(s);
								if (I.intValue() > -1000000000 && I.intValue() < 1000000000) {
									this.ready = true;
									nextItem = I;
									return true;
								}
							} catch (NumberFormatException ex) {
								continue;
							}
						}
					} catch (IOException e) {
						// error in IO equals false
						this.ready = false;
						return false;
					}
				}
				// no more valid values, so return false and set ready to false
				this.ready = false;
				return false;
			}

			@Override
			public Integer next() {
				// if ready, just return and reset the flag
				if (this.ready) {
					this.ready = false;
					return this.nextItem;
				}
				// not ready, then call hasNext() to make it ready. if
				// successful, then return
				// the Integer and reset the flag
				else if (this.hasNext()) {
					this.ready = false;
					return this.nextItem;
				}
				// hasNext has failed to obtain next item, throw exception!
				else {
					throw new NoSuchElementException();
				}
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}

}
