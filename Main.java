// 상황 : DVD방에 3개의 서로다른 tv가 있다. 영업을 하다보니 각 tv의 특별한 기능은 거의 사용될 일이 없고 기본적인 켜기/끄기 만 사용된다. 현재 리모콘이 3개나 있는습니다.
// 문제 : 생성자 이용해서 tv 3개 작동시키기

class Main {
	public static void main(String[] args) {


		샤오미Tv a샤오미Tv = new 샤오미Tv();
		삼성Tv a삼성Tv = new 삼성Tv();
		LGTv aLGTv = new LGTv();
		

		a샤오미Tv.켜기();
		a샤오미Tv.끄기();
		a샤오미Tv.vr켜기();
		a삼성Tv.켜기();
		a삼성Tv.끄기();
		a삼성Tv.ar켜기();
		aLGTv.켜기();
		aLGTv.끄기();
		aLGTv.게임모드전환();
		
		
	}
}
class 표준Tv{
	String name;
	void 켜기() {
		System.out.printf("%s 켜집니다.\n", name);
	}

	void 끄기() {
		System.out.printf("%s 꺼집니다.\n", name);
	}
}

class 샤오미Tv extends 표준Tv {
	샤오미Tv(){
		this.name = "샤오미Tv";
	}
	void vr켜기() {
		System.out.println("샤오미Tv vr켜기!");
	}
}

class 삼성Tv extends 표준Tv {
	삼성Tv(){
		this.name = "삼성Tv";
		}
	void ar켜기() {
		System.out.println("삼성Tv ar켜기!");
	}
}

class LGTv extends 표준Tv{
	LGTv(){
		this.name ="LGTv";
		}
	void 게임모드전환() {
		System.out.println("LGTv 게임모드전환!");
	}
}