def solution1(A):
	B = len(A) * [-1]
	for i in range(len(A)):
		if A[i] > len(A):
			return 0
		elif B[A[i] - 1] == -1:
			B[A[i] - 1] = 1
		else:
			return 0
	return 1

def main():
	print solution1([4, 1, 3, 2])
	print solution1([1, 1, 3, 2])
	print solution1([4, 1, 3])

if __name__ == "__main__":
		main()
