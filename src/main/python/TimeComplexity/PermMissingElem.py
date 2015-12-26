def solution(A):
	print range(1, len(A) + 2)
	return (sum(range(1, len(A) + 2)) - sum(A))
