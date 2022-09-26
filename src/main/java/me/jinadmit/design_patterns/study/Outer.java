package me.jinadmit.design_patterns.study;

/**
 * 로딩시점을 알아보자.
 * =======================================================================
     * > Task :Outer.main()
     * 1 - Initializing class Outer, where TEST01 = I'm TEST01
     * 2 - TEST01       --> I'm TEST01
     * 3 - Inner.class  --> class me.jinadmit.design_patterns.study.Outer$Inner
     * 4 - Initializing class Inner
     * 5 - Inner.info() --> I'm a method in Inner
 * ========================================================================
 * 각 단계에 대한 자세한 내용:
     * 1 - 프로그램을 실행하면 'Outer' 클래스가 초기화됩니다.
     * static 변수 'TEST01'은 static 블록 전에 초기화됩니다.
     * 'Inner' 클래스가 초기화되지 않았습니다.
     *
     * 2 - 'Main' 메서드가 호출되어 'TEST01'의 값을 표시합니다.
     *
     * 3 - System.out은 'Inner' 클래스를 나타냅니다.
     * 'Inner' 클래스는 초기화되지 않았지만 로드되었습니다(메모리 모델에 참조가 있는 이유임).
     *
     * 4 - 가장 흥미로운 부분은 다음과 같습니다.
     * 왜냐하면 System.out은 'Inner'(Inner.info)의 'info' 메서드에 액세스해야 하며,
     * 'info' 메서드의 결과를 반환하기 전에 'Inner' 클래스를 초기화해야 합니다.
     * 그래서 'Inner' 클래스의 static 이 4단계입니다.
     *
     * 5 - 마지막으로 System.out에는 표시해야 할 모든 데이터가 있고, 마지막 줄이 콘솔에 표시됩니다.
 */

/**
 * static class 는 main 메서드를 실행하기전에 초기화가 진행된다.
 * inner class 는 로드가 되어있지만 초기화 전 상태이다.
 * 5번의 호출전에 inner class 의 초기화가 진행됨.
 * ================================================================
 * 0. Outer.class Inner.class 둘 다 로드 됨.
 * 1. Outer.class의 Main메소드를 호출하기 위해 Outer 클래스 초기화 진행
 * 2. static 선언은 클래스 초기화와 동시에 이루어지기 때문에 Main 메소드 전에 호출 됨.
 * 3. Main 메소드 호출
 * 4. Main 메소드를 통해 Inner.info() 접근 시도
 * 5-0. Inner.class는 static이기에 새로 new 를 통해 신규 인스턴스를 생성하지 않음.
 * 5-1. 그럼 Inner.class가 이미 초기화가 되었는가? - x
 * 5-2. Inner.class 초기화 진행
 * 6. static 선언은 클래스 초기화와 동시에 이루어지기 때문에 info 메소드 호출 전에 호출 됨.
 * 7. Inner.info() 호출
 */
public class Outer
{

    private static final String TEST01 = "I'm TEST01";

    static
    {
        System.out.println("1 - Initializing class Outer, where TEST01 = " + TEST01);
    }

    public static void main(String[] args)
    {
        System.out.println("2 - TEST01       --> " + TEST01 );
        System.out.println("3 - Inner.class  --> " + Inner.class);
        System.out.println("5 - Inner.info() --> " + Inner.info() );
    }

    private static class Inner
    {

        static
        {
            System.out.println("4 - Initializing class Inner");
        }

        public static String info()
        {
            return "I'm a method in Inner";
        }
    }
}
