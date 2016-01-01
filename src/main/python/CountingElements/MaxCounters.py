def solution1(N, A):
	maxcount = 0
	offset = 0
	counters = [0] * N
	for i in A:
		if i <= N:
			counters[i - 1] = max(offset, counters[i - 1])
			counters[i - 1] += 1
			if counters[i - 1] > maxcount:
				maxcount = counters[i - 1]
		elif i == N + 1:
			offset = maxcount
		else:
			raise Exception("Array value is bigger than N+1!")
	print offset
	print counters
	return [max(x, offset) for x in counters]

def main():
	print solution1(5, [3, 4, 4, 6, 1, 4, 4])
	print solution1(5, [6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6])

if __name__ == "__main__":
		main()
