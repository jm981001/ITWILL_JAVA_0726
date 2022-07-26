package array;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * 도로 교통 상황이 숫자로 주어진다.
		 * 
		 * 출발 70 80 60 20 30 50 10 80 77 89
		 *           ||    ||    ||
		 *     70 60 40 50 55 65 23 44 37 88 도착
		 * 
		 * 북 쪽에서 남쪽 다리 index 번호가 주어진다.
		 * 이때, 가장 최소 시간이 소요되는 다리는 몇번 다리인지 출력하고 최소시간을 함께 출력해보자!
		 * 
		 * 출력예시) 다리번호: 6
		 * 		   최소시간: 512
		 * 
		 * 주의사항.
		 * 1. 무조건 다리를 1번 건너야함 (도착지점이 남쪽이기 때문에)
		 * 2. 다리를 여러번 건널수 없고 딱, 한번만 가능
		 * 3. 다리를 건널때에는 남쪽, 북쪽 소요시간이 같이 소요됨. (즉, 같이 합산해야함)
		 * 4. 소요시간이 같은 경우 발생하면 낮은 다리번호를 출력
		 * 
		 * */
		int[] north = {70, 80, 60, 20, 30, 50, 10, 80, 77, 89};
//							   ||      ||      ||
		int[] south = {70, 60, 40, 50, 55, 65, 23, 44, 37, 88};
//		int[] north = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//		int[] south = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		
		int[] bridge = {2, 4, 6};
		int[] total = new int[bridge.length];
		
		
		for(int i=0; i < bridge.length; i++) {
			int b = bridge[i];
			
			// 북쪽 합
			for(int j = 0; j <= b; j++) {
				total[i] += north[j];
			}
			// 남쪽 합
			for(int j = b; j < south.length; j++) {
				total[i] += south[j];
			}
		}
		
		int minIndex = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i < total.length; i++) {
			if(min > total[i]) {
				min = total[i];
				minIndex = i;
			}
		}
		System.out.println("다리번호: " + bridge[minIndex]);
		System.out.println("최소시간: " + min);
		
		
		
		
	}
	

}
