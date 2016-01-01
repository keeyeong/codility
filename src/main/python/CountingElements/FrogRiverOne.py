def solution1(X, A):
	B = range(1, X + 1)
	for i in range(0, len(A)):
		try:
			B.remove(A[i])
		except ValueError:
			pass
		if len(B) == 0:
			return i
	return -1

def solution2(X, A):
	B = [-1] * X
	Y = X
	for i in range(0, len(A)):
		if B[A[i] - 1] == -1:
			B[A[i] - 1] = 0
			Y = Y - 1
		if Y == 0:
			return i
	return -1

def main():
	print solution1(5, [1, 3, 1, 4, 2, 3, 5, 4])
	print solution2(5, [1, 3, 1, 4, 2, 3, 5, 4])

if __name__ == "__main__":
		main()
