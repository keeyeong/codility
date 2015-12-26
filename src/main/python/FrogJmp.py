def solution(X, Y, D):
	jumps = (Y - X) / D
	if (Y - X) % D == 0:
		return jumps
	else:
		return jumps + 1