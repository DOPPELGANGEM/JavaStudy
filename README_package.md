# Java Package - 정리

<h2>🎉 패키지 키워드</h2>
<p>패키지(Package)란 클래스의 묶음이다. 패키지에는 클래스,인터페이스를 포함시킬 수 있다. 서로 관련된 클래스들끼리 묶어놓음으로써 클래스를 효율적으로 관리할 수 있다. <br>같은 이름의 클래스라도 서로 다른 패키지에 존재할 후 있다. <br>원래 클래스의 실제 이름은 패키지명을 포함한 것이다. 예를 들어 String클래스의 실제 이름은 <strong>java.lang.String</strong>이다. java.lang라는 패키지에 포함된 String이라는 클래스인 것이다. 클래스가 물리적으로 하나의 클래스 파일인 것처럼, 패키지는 물리적으로 하나의 디렉토리이다.</p>
<ul>
  <li>패키지 이름을 java로 시작하면 안된다.</li>
  <li>패키지 이름과 위치한 폴더의 이름이 같아야 한다.</li>
  <li>하나의 소스파일에는 첫번째 문장으로 단 한번의 패키지 선언만을 허용한다.</li>
  <li>모든 클래스는 반드시 하나의 패키지에 속해야한다</li>
  <li>패키지 .을 구분자로 하여 계층구조로 구성할 수 있다.</li>
</ul>
<hr>

<h2>🎉 자바의 기본 패키지(java.lang, java.util)</h2>
<h3>1. java.lang 패키지</h3>
<p>자바 프로그램의 기본적인 클래스를 담고 있는 패키지</p>
<ul>
  <li>java.lang 패키지에 속한 클래스와 인터페이스는 import없이 사용할 수 있다.</li>
  <li>String System 클래스도 java.lang패키지에 속해 있으므로 import없이 사용할 수 있다.</li>
</ul>
<h4>주요 클래스</h4>
<p><strong>Object</strong><br>: 자바 클래스의 최상위 클래스</p>
<p><strong>System</strong><br>: 표준 입력 장치로 부터 데이터를 입력받을 때 사용 <br>: 표준 출력 장치로 출력하기 위해 사용 <br> : 자바 가상 기계를 종료시킬 때 사용 <br> : GC를 실행 요청할 때 사용</p>
<p><strong>System</strong><br>: 클래스를 메모리로 로딩할 때 사용</p>
<p><strong>String</strong><br>: 문자열을 저장하고 여러 가지 정보를 얻을 때 사용</p>
<p><strong>StringBuffer, StringBuilder</strong><br>: 문자열을 저장하고 내부 문자열을 조작할 때 사용</p>
<p><strong>Math</strong><br>: 수학 함수를 이용할 때 사용</p>
<p><strong>Wrapper</strong><br>: 기본 타입의 데이터를 갖는 객체를 만들 때 사용 <br>: 문자열을 기본 타입으로 변활할 때 사용 <br> : 입력값 검사에 사용 <br> : 기본타입은 null을 담을 수 없으나 Wrapper클래스는 null을 대입할 수 있습니다.</p>

<h3>2. java.util 패키지</h3>
<p>자바 프로그램의 조미료 역할을 클래스를 담고 있는 패키지</p>
<p>java.util 패키지는 주로 컬렉션 클래스들이 대부분을 차지하고 있습니다.(List, Map, Set)</p>
<h4>주요 클래스 및 인터페이스</h4>
<p><strong>Arrays</strong><br>: 배열을 조작(비교,복사,정렬,찾기)할 때 사용</p>
<p><strong>Calendar</strong><br>: 운영체제의 날짜와 시간을 얻을 때 사용</p>
<p><strong>Date</strong><br>: 날짜와 시간 정보를 저장하는 클래스</p>
<p><strong>Objects</strong><br>: 객체 비교, null 여부 등을 조사할 때 사용</p>
<p><strong>StringTokenizer</strong><br>: 특정 문자로 구분된 문자열을 뽑아낼 때 사용</p>
<p><strong>Random</strong><br>: 난수를 얻을 때 사용</p>
<p><strong>List (컬렉션 프레임워크:객체를 수집해서 저장하는 역할)</strong><br>: ArrayList, Vector, LinkedList(구현클래스) <br>: 객체를 일렬로 늘어놓은 구조 <br>: 순서를 유지하고 저장, 중복 저장 가능</p>
<p><strong>Set (컬렉션 프레임워크:객체를 수집해서 저장하는 역할)</strong><br>: HashSet, TreeSet(구현클래스) <br>: 순서를 유지하지 않고 저장, 중복 저장 안됨</p>
<p><strong>Map (컬렉션 프레임워크:객체를 수집해서 저장하는 역할)</strong><br>: HashMap, HashTable, TreeMap, Properties (구현 클래스) <br>: 키와 값의 쌍으로 저장 <br>: 키는 중복 저장 안 됨</p>
<hr>

<h3>3. Java I/O 패키지</h3>
<p>[API Document] (https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/io/package-summary.html)<br> [Java-IO 패키지 주요 클래서 및 설명 참고 URL] (https://velog.io/@ljs0429777/Java-IO)</p>
<p>간단하게 말하면 <strong>데이터스트림, 직렬화 및 파일 시스템을 통한 시스템 입력 및 출력제공</strong> 이다. 즉 I/O 패키지 안에는 파일 입출력과 관련된 클래스들로 구성되어 있다는 의미기도하다.</p>
<h4>👀 바이트 단위 스트림</h4>
<ul>
  <li>InputStream, OutputStream 둘다 바이트 기반 입출력 스트림의 최상위 클래스로 추상 클래스이다. <br>관련된 모든 바이트 기반 입출력 스트림은 이 클래스를 상속받아서 만들어진다.</li>
  <li>바이트 단위로 데이터를 전송하며 입출력 대상에 따라 제공하는 클래스가 다르다.</li>
  <li>그림, 멀티미디어, 문자 등 모든 종류의 데이터를 주고 받을 수가 있다.</li>
</ul>
<h4>👀 문자 단위 스트림</h4>
<ul>
  <li>Reader, Writer 둘다 데이터 기반 입출력의 최상위 클래스이다. 관련된 모든 텍스트 <br>기반 입출력은 이 클래스를 상속받아서 만들어진다.</li>
  <li>문자데이터를 입출력할 때 사용하는 문자기반의 스트림이다.</li>
  <li>오로지 문자 데이터를 주고 받기 위해 특화되엇다.</li>
</ul>
<h4>👀 보조스트림</h4>
<p>스트림의 기능을 보완하기 위해 나온 녀석이다.(입출력 성능 속도 향상, 데이터 포맷 등)</p>
<ul>
  <li>실제 데이터를 주고 받지 않는다.</li>
  <li>데이터를 주고 받을 수 없기 때문에 먼저 스트림을 생성한 후 사용해야 한다.</li>
  <li>밑에 실험한 코드가 보조 스트림 활용 예시이다.</li>
  <blockquote>DataInputStream dataInputStream = new DataInputStream(new FileInputStream("test.txt"));</blockquote>
</ul>