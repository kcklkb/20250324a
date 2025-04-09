package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit 5

@SpringBootTest
class Step07CicdApplicationTests {

		@Test
		public void testAddition() {
			int result = 12 + 3;
			/* 예시 -> 서버가 시작될때 특정 db로부터 검색을 해옴
			 * 그 데이터는 반듯이 fisa여야만 하는 상황
			 * 만약 fisa가 없다면 서버 중지 또는 다른 로직 실행 유도 등의 액션을 취함
			 * 서비스 전에 사전 검증하는 것
			 * 
			 * 예시2 -> 개발중에 데이터에 대한 test 검증용등으로 사용
			 */
			System.out.println("비교전*************");
			assertEquals(11, result); // 성공: 5 == 5
			System.out.println("비교후*************");
		}
}
