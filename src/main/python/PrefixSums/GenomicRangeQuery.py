import ktanlib

def solution1(S, P, Q):
	mapping = {'A':1, 'C':2, 'G':3, 'T':4}
	result = [0] * len(P)
	for i in range(len(P)):
		# print P[i],Q[i],S[P[i]:Q[i]+1]
		result[i] = mapping[min(S[P[i]:Q[i] + 1])]
	return result

def solution2(S, P, Q):
		result = []
		DNA_len = len(S)
		mapping = {"A":1, "C":2, "G":3, "T":4}
		# next_nucl is used to store the position information
		# next_nucl[0] is about the "A" nucleotides, [1] about "C"
		# 		[2] about "G", and [3] about "T"
		# next_nucl[i][j] = k means: for the corresponding nucleotides i,
		# 		at position j, the next corresponding nucleotides appears
		# 		at position k (including j)
		# k == -1 means: the next corresponding nucleotides does not exist
		next_nucl = [[-1] * DNA_len, [-1] * DNA_len, [-1] * DNA_len, [-1] * DNA_len]
 
		# Scan the whole DNA sequence, and retrieve the position information
		next_nucl[mapping[S[-1]] - 1][-1] = DNA_len - 1
		for index in range(DNA_len - 2, -1, -1):
				next_nucl[0][index] = next_nucl[0][index + 1]
				next_nucl[1][index] = next_nucl[1][index + 1]
				next_nucl[2][index] = next_nucl[2][index + 1]
				next_nucl[3][index] = next_nucl[3][index + 1]
				next_nucl[mapping[S[index]] - 1][index] = index
 
		for index in range(0, len(P)):
				if next_nucl[0][P[index]] != -1 and next_nucl[0][P[index]] <= Q[index]:
						result.append(1)
				elif next_nucl[1][P[index]] != -1 and next_nucl[1][P[index]] <= Q[index]:
						result.append(2)
				elif next_nucl[2][P[index]] != -1 and next_nucl[2][P[index]] <= Q[index]:
						result.append(3)
				else:
						result.append(4)
		return result

def solution3(S, P, Q):
	mapping = {'A':1, 'C':2, 'G':3, 'T':4}
	result = [0] * len(P)
	next_occurence = [[-1] * len(S), [-1] * len(S), [-1] * len(S), [-1] * len(S)]
	next_occurence[mapping[S[-1]] - 1][-1] = len(S) - 1
	for i in range(len(S) - 2, -1, -1):
		next_occurence[0][i] = next_occurence[0][i + 1]
		next_occurence[1][i] = next_occurence[1][i + 1]
		next_occurence[2][i] = next_occurence[2][i + 1]
		next_occurence[3][i] = next_occurence[3][i + 1]
		next_occurence[mapping[S[i]] - 1][i] = i

	for j in range(len(P)):
		if next_occurence[0][P[j]] != -1 and next_occurence[0][P[j]] <= Q[j]:
			result[j] = 1
		elif next_occurence[1][P[j]] != -1 and next_occurence[1][P[j]] <= Q[j]:
			result[j] = 2
		elif next_occurence[2][P[j]] != -1 and next_occurence[2][P[j]] <= Q[j]:
			result[j] = 3
		else:
			result[j] = 4
	return result

def main():
	S = list("CAGCCTA")
	P = [2, 5, 0]
	Q = [4, 5, 6]
	# print solution1(S,P,Q)
	print solution2(S, P, Q)
	print solution3(S, P, Q)
	# print solution1(ktanlib.generate_random_array(0,1,1000000))
	# print ktanlib.prefix_sum([0,1,0,1,0,1]) # 6

if __name__ == "__main__":
		main()
