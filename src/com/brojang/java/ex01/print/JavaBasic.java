package com.brojang.java.ex01.print;

public class JavaBasic {
    /**
     * 자바 프로그래밍 언어의 특징
     *
     * 객체지향 프로그래밍 언어
     * - 객체 지향이라는 것은 객체를 기반으로 프로그래밍하는 언어의 특징을 말하며 이와 같은 특징을 가진 언어를 객체지향 프로그래밍언어라고 함
     *
     * - 자바의 경우 객체를 통해 모든 로직을 생성하고, 관리 및 동작 시키며 이를 통해 자바는 가장 대표적인 객체지향 프로그래밍 언어라고 할 수 있다.
     *
     * - 자바의 로직은 실제 객체를 통해 배포가 되며 모든 로직은 메서드 기반으로 동작한다.
     *
     * - 메서드 밖에서는 로직이 생존할 수 없는 구조이기 때문에 반드시 메서드를 통해서만 로직 생성 및 실행이 가능
     *
     *
     * 객체 구조
     * - 객체는 크개 속성과 기능으로 정의
     *
     * - 속성 : 해당 객체가 가지고 있는 값 (ex, 색깔, 양, 상수 등)
     *
     * - 기능 : 해당 객체가 실제 할 수 있는 동작 (ex, 그리기, 쓰기, 동작, 합치기 등)
     *
     * - 객체에는 해당 객체의 특유 속성을 이용하여 기능을 실행하며 객체마다 속성을 다를 수 있음
     *
     * - 자바 프로그래밍 언어에서 이러한 속성을 필드 혹은 멤버변수라고 칭하며 기능을 메서드라고 한다.
     *
     * - 필드 선언 방법 : [접근제어자] [타입] [변수명] = [변수값]
     * - 메서드 선언 방법 : [접근제어자] [리턴타입] [메서드명] ( [매개변수] ) { [메서드 로직] }
     *
     * JVM, JRE, JDK
     *
     * - JRE : Java Runtime Environment(자바 실행 환경)
     *
     * 자바가 어떤 OS에서 구동하든 상관없이 자바 소스 코드가 동일하게 동작시키는 환경을 제공하는 모듈
     *
     * 이를 통해 OS 변화에 상관없이 해당 OS에서 개발한 소스를 다른 OS에서 동일하게 실행이 가능
     *
     * - JDK : Java Development Kit
     *
     * 자바 개발에 필요한 모든 자원들을 담고 있는 모듈
     *
     * 해당 모듈은 어떤 자바 JDK 를 쓰느냐에 따라 스펙의 차이가 있을 수 있음(보통은 동일한 모듈 제공)
     *
     * - JVM : Java Virtual Machine
     *
     * 자바가 구동될 때 필요한 메모리 생성, 관리, 실제 런타임 환경에서 실행 동작 관리 등
     * 자바 실행에 필요한 전반적인 메모리의 관리를 담당하는 가상 머신.
     *
     * 이 머신을 통해 OS의 특정 영역에 메모리를 잡아 자바를 구동시키며 안정적인 자바의 실행이 가능하도록 만든다.
     *
     * JVM 메모리 구조
     *
     * - JVM 은 5개의 메모리 구조로 나뉘게 되며 각각 CLASS 영역, Heap 영역, Stack 영역, PC Register 영역,  Native 메모리 영역으로 나뉜다.
     *
     * - Class 메모리 영역 : 자바 프로그램이 런타임 영역에서 메모리에 적재가 될 때 프로그래머가 만들어 두었던 모든 클래스, 메서드 스팩, static 필드 등
     * 로직 실행에 필요한 모든 자원이 들어가는 곳.
     *
     * 엔트리 포인트(Public static void main(String[] args))의 경우 여기의 Class 메모리 영역에 적재된다.
     *
     * 다른 이름으로는 메서드 메모리 영역, 혹은 스태틱 메모리 영역으로 불리기도 한다.
     *
     * - Heap 영역 : 클래스를 통해 만들어진 인스턴스의 주소값이 이 메모리 영역에 적재된다.
     *
     * 해당 메모리 내에서는 new로 선언한 모든 인스턴스 메모리 주소값 및 로직을 실행할 Stack의 메모리 주소 링크, 그리고 해당 인스턴스에서 사용할 필드 값들이 여기에 들어간다.
     *
     * Heap 영역은 JVM의 heap opserver를 통해 실시간으로 관리가 되며 해당 인스턴스가 사용되지 않을 경우 GC에 의해 제거된다.
     *
     * - Stack 영역 : 인스턴스를 통해 로직을 실행할 경우 해당 로직이 실행되는 장소이며 로직들의 정보를 Class 메모리 영역에서 가져와 Stack 형태의 프로세스를 통해
     * 해당 로직을 실행하고 메모리를 비운다. 위의 두개의 메모리보다 메모리를 반환하는 속도가 가장 빠르다.
     *
     * - PC Register 영역 : 쓰레드를 동기화 시키거나 쓰레드간 통신이 필요로 할 경우 사용하는 메모리 영역
     *
     * - Native 메모리 영역 : 서로 다른 언어 혹은 서로 다른 시스템 간의 메모리 동기화를 위해 사용하는 메모리 영역
     *
     * 임베디드 영역에서 활발하게 사용되지만 Web에서는 딱히 잘 사용되지 않는다.
     *
     *
     * Static
     * - Static은 Class Memory 영역에 적재되어 사용되는 field 혹은 method를 선언할 때 사용되는 키워드로 해당 키워드를 통해 인스턴스 없이 접근할 수 있는
     * 필드 혹은 메서드의 생성이 가능하다.
     *
     * - 이를 통해 각 인스턴스는 해당 값에 대한 공유가 가능하며 인스턴스의 선언 없이 해당 값에 대한 접근이 가능하다.
     *
     * - 다만 Static을 사용할 경우 Class 메모리 영역 자체가 비대해져 Buffer Overflow 현상으로 인해 시스템에 심각한 오류 및 하드웨어의 고장을
     * 유발하므로 Static을 가급적이면 쓰지 말 것
     *
     *
     *
     *
     */
}
