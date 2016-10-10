package com.alpro3.spiral;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       espiral(10, 50);
    }

	private static void espiral(int N, int B) {
		int nv, nh = 0;


		/**
		 * validações
		 */

		for(int borda = 1; borda < N/2; borda++) {
			if(borda % 2 == 0) { //esta subindo e para direita
				if(B > ((N-borda) * 2) ) {
					nv = N - borda;
					nh = N - borda;
					B -= 1;
				} else {
					if(B > (N-borda) ) {
						nv = N - borda;
						nh = B + borda;
					}

				}

			} else { //esta descendo e para esquerda

			}





			if(B > ((N-borda) * 2) ) {
				if(borda % 2 == 0) {


				} else {

				}

			} else { // menor do que 2N-borda
				if(B < borda - N) {
					// primeira metade
					if(borda % 2 == 0) {

					}
				}

				if(borda % 2 == 0) {
					//calcula
				}

			}

		}

		/*
		 * N
		 * N-1
		 * N-1
		 * N-2
		 * N-2
		 * N-3
		 * N-3
		 */



	}
}
