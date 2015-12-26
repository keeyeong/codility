def solution(A):
	left = A[0]
	right = sum(A[1:])
	min = abs(left - right)
	# print "left=%d, right=%d, diff=%d" % (left, right, min)
	for i in range(1, len(A) - 1):
		left = left + A[i]
		right = right - A[i]
		diff = abs(left - right)
		if diff < min:
			min = diff
		# print "left=%d, right=%d, diff=%d" % (left, right, diff)
	return min
