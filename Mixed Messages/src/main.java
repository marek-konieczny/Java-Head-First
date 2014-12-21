
public class main {

	public static void main(String[] args) {
		int x =0;
		int y =0;
		while (x<5){
			y=x-y;
			
			System.out.print(x+""+y+" ");
			x=x+1;
		}
		// prediction 
		// xy - output
		// 00 ->00
		// 10 ->11
		// 21 ->21
		// 31 ->32
		// 42 ->42
		
		System.out.println();
		 x =0;
		 y =0;
		while (x<5){
			y=y+x;
			
			System.out.print(x+""+y+" ");
			x=x+1;
		}
		// prediction
		// xy - output
		// 00 -> 00
		// 10 -> 11
		// 21 -> 23
		// 33 -> 36
		// 46 -> 410
		
		System.out.println();
		 x =0;
		 y =0;
		while (x<5){
			y=y+2;
			if(y>4){
				y=y-1;
			}
			
			System.out.print(x+""+y+" ");
			x=x+1;
		}
		// prediction
		// xy - output
		// 00 -> 02
		// 12 -> 14
		// 24 -> 25
		// 35 -> 36
		// 46 -> 47
		
		System.out.println();
		 x =0;
		 y =0;
		while (x<5){
			x=x+1;
			y=y+x;
			
			System.out.print(x+""+y+" ");
			x=x+1;
		}
		// prediction
		// xy - output
		// 00 -> 11
		// 21 -> 34
		// 44 -> 59
		
		System.out.println();
		 x =0;
		 y =0;
		while (x<5){
			
			if(y<5){
				x=x+1;
				if(y<3){
					x=x-1;
				}
			}
			y=y+2;

			
			System.out.print(x+""+y+" ");
			x=x+1;
		}
		// prediction
		// xy - output
		// 00 -> 02
		// 12 -> 14
		// 24 -> 36
		// 46 -> 48

	}

}
