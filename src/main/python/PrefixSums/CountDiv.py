def solution1(A, B, K):
	if A % K == 0:
		return B / K - A / K + 1
	else:
		return B / K - A / K

def main():
	# print solution1([2,2])
	print solution1(6, 11, 2)  # = 3
	print solution1(1, 10, 2)  # = 5
	print solution1(2, 10, 2)  # = 5
	print solution1(4, 10, 2)  # = 4
	print solution1(4, 10, 3)  # = 2
	print solution1(2, 10, 3)  # = 3
	print solution1(2, 9, 3)  # = 3

if __name__ == "__main__":
		main()
