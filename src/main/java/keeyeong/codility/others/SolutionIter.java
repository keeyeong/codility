package keeyeong.codility.others;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;

public class SolutionIter implements Iterable<Integer> {

	/**
	 * Example usage:
	 *
	 * for (Integer x : new SolutionIter(reader)) { System.out.println(x); }
	 */

	BufferedReader br;
	private ArrayList<Integer> arrayList;
	private int currentSize;

	public SolutionIter(Reader inp) {
		String currentLine;
		this.arrayList = new ArrayList<Integer>();
		try {
			this.br = new BufferedReader(inp);
			while ((currentLine = br.readLine()) != null) {
				try {
					String s = currentLine.trim();
					Integer I = Integer.parseInt(s);
					if (I.intValue() > -1000000000 && I.intValue() < 1000000000) {
						arrayList.add(I);
					}
				} catch (NumberFormatException ex) {
					continue;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return this.arrayList.iterator();
	}

}
