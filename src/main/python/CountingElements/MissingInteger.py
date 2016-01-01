def solution(A):
    # Credit to codesays.com
	''' Solve it with Pigeonhole principle.
		There are N integers in the input. So for the
		first N+1 positive integers, at least one of 
		them must be missing.
	'''
	# We only care about the first N+1 positive integers.
	# occurrence[i] is for the integer i+1.
	occurrence = [False] * (len(A) + 1)
	for item in A:
		print item, occurrence
		if 1 <= item <= len(A) + 1:
			occurrence[item - 1] = True
		
	# Find out the missing minimal positive integer.
	for index in xrange(len(A) + 1):
		if occurrence[index] == False:
			return index + 1
		
	raise Exception("Should never be here.")
	return -1

def solution1(A):
	# My Epic PHAIL solution that doesn't even work
	minint = 0
	found = []
	for i in range(len(A)):
		if not A[i] in found:
			found.append(A[i])
		if not A[i] - 1 in found:
			minint = A[i] - 1
	return 0

def main():
	print solution([-100, 20, 1, 3, 6, 4, 1, 2])
	print solution([100, 120, 5, 6])
	# print solution1([1,3,6,4,1,2])

if __name__ == "__main__":
		main()
