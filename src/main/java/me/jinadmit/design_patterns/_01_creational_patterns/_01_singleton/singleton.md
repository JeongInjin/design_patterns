#SingleTon

- 하나의 인스턴스가 필요할 때.
- private 생성자로 new 인스턴스화를 막는다.


- Singleton5 - static inner class 를 통한 싱글톤 생성이 가장 보편적이다.
  - 코틀린은 object 키워드를 사용한다.
- 또는 enum 을 활용해 만드는것을 추천한다.
  - 리플렉션에도 대응이 가능하다.
