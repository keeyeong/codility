def solution(A):
	# First sum is what the sum should be if all elements are there
	# Second sum is what the sum is from the input A
	# The difference is the missing number
	return (sum(range(1, len(A) + 2)) - sum(A))
