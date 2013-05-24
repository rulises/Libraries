import java.lang.Math;

class Vector{
	public static void main (String [] args){

	}


	// OPERATIONS
	// VECTOR ADDITION
	int [] vectorAddition(int [] A, int [] B){
		int [] C = new int [A.length];
		for (int i  =0; i < A.length; i++){
			C[i] = A[i]+B[i];
		}
		return C;
	}
	//NORM OF A VECTOR
	double norm(int [] A){
		double C = 0;
		for(int i = 0;  i<A.length;i++){
			C+= Math.pow(A[i],2);
		}
		return Math.sqrt(C);
	}
	//DOT PRODUCT
	int dotProduct(int [] A, int  [] B){
		int  C = 0;
		for(int i = 0 ; i < A.length; i ++){
			C += A[i]*B[i];
		}
		return C;
	}

	//CROSS PRODUCT in 2D
	int [] crossProduct(int [] A, int [] B){
		int C = 0;
		C+=A[0]B[1];
		C-=A[1]B[0];
		return C;
	}
	//DISTANCE FROM VECTOR TO VECTOR
	double distanceToPoint(int [] A, int [] B){
		int [ ] D = new int  [A.length];
		for (int i = 0 ; i < A.length ; i ++){
			D[i] = A[i]- B[i];
		}
		int C = 0;
		for (int i = 0; i < D.length;i++)
			C += Math.pow(D[i],2);
		return Math.sqrt(C);
	}


}
