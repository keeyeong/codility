import ktanlib

def solution1(A):
	left = [0] * len(A)
	right = [0] * len(A)
	count = 0
	for i in range(len(A)):
		left[i] = i - A[i]
		right[i] = i + A[i]
		# print i,left[i],right[i]
	for j in range(len(A)):
		for k in range(j + 1, len(A)):
			if (j <= right[k] and j >= left[k]) or (k <= right[j] and k >= left[j]):
				count += 1
				# print "incl: ",j,left[k],right[k],k
			# else:
				# print "excl: ",j,k,left[k],right[k]
			if count > 10000000:
				return -1
	return count


def main():
	# A=[10,2,5,1,8,20]
	A = [1, 5, 2, 1, 4, 0]
	B = ktanlib.generate_random_array(0, 2 ** 64, 100000)
	# print B
	# print solution1(A)
	# print solution1(B) 
	print solution1([1, 1, 1]) 
	# print solution1(ktanlib.generate_random_array(0,1,1000000))
	# print ktanlib.prefix_sum([0,1,0,1,0,1]) # 6

if __name__ == "__main__":
		main()
