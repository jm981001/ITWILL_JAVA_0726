package array;

public class Ex2 {

	public static void main(String[] args) {
		//다차원 배열
		//1차원 배열 여러개가 모여 2차원 이상의 배열을 이루는것
		//일반적으로 다차원 배열 = 2차원 배열을 의미
		
		//2차원 배열
		//-행 열 구조로 이루어져있음
		//실제 데이터가 저장되는 공간 = 열
		//열 공간의 주소를 저장하는 공간 = 행
		//-배열크기
		// 1)행 크기 : 배열명.length
		// 2)열 크기 : 배열명[행인덱스].length
		
		//<2차원 배열 선언 기본 문법 >
		//데이터타입[][] 변수명;
		
		//< 2차원 배열 인덱스 접근 기본 문법 >
		// 변수명[행인덱스][열인덱스];
		
		int[][] arr ;
		arr = new int[2][3];
		
		arr[0][0] = 1;arr[0][1] = 2;arr[0][2] = 3;
		arr[1][0] = 4;arr[1][1] = 5;arr[1][2] = 6;
		
		System.out.println(arr[0][0] + " " +arr[0][1]+ " " + arr[0][2]);
		System.out.println(arr[1][0] + " " +arr[1][1]+ " " + arr[1][2]);
		System.out.println("=====================");
		
		for(int i =0; i <arr.length; i++) { //행만큼 반복
			for(int j = 0; j <arr[i].length; j++) {//열만큼 반복
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//배열의 크기
		System.out.println("배열 arr의 행 크기 : " +arr.length );
		System.out.println("배열 arr의 0번 행의 열 크기 : " +arr[0].length );
		System.out.println("배열 arr의 1번 행의 열 크기 : " +arr[1].length );
		System.out.println("=====================");

		int[][] arr2 = {
					{10, 20, 30},
					{40, 50, 60}
		};

		for(int i =0; i <arr2.length; i++) { //행만큼 반복
			for(int j = 0; j <arr2[i].length; j++) {//열만큼 반복
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");

		//2차원 배열에서 각 행의 열 갯수가 동일하지 않을 수 있다!
		//--------------------------------------------
		//1. 데이터를 한꺼번에 초기화 하는 방법
		int[][] arr3 = {
				{1,2,3},
				{4,5},
				{6,7,8,9,10}
		};
		for(int i =0; i <arr3.length; i++) { //행만큼 반복
			for(int j = 0; j <arr3[i].length; j++) {//열만큼 반복
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");

		int[][] arr4 = new int[3][];
		
//		arr4[0] = new int[3]; //0행에 3개 넣을것이다
//		arr4[1] = new int[2];
//		arr4[2] = new int[5];
		
//		arr4[0] = {1,2,3}; 에러뜸 배열 변수 선언과 생성 및 초기화를 한줄에 할때에만 { } 사용 가능
		
		arr4[0] = new int[] {1,2,3}; //가능
		arr4[1] = new int[] {4,5};
		arr4[2] = new int[] {6,7,8,9,10};
		for(int i =0; i <arr4.length; i++) { //행만큼 반복
			for(int j = 0; j <arr4[i].length; j++) {//열만큼 반복
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("=====================");
	}
}
