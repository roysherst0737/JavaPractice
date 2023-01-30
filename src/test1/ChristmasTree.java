package test1;

public class ChristmasTree {

public static void main(String[] args) {
		
		String endColor = "\u001b[0m";//结束字符串
		//背景颜色
		String startYellowBack = "\033[43m";//黄背景
		String endBack = "\033[m";
		//1:加粗,;:隔开,90~97字体颜色变亮
		String startStrongGreen = "\033[1;92m";//重亮灰
		String startStrongPink = "\033[1;95m";//重亮粉

		//树叶高度
		int height = 10;
		//树根高度
		int rootHeight = 4;
		int blank = height-1;
		
		//生成树叶
		for(int i=0;i<height;i++) {
			for(int j=0;j<blank;j++) {
				System.out.print(" ");
			}
			for(int z=0;z<=i*2;z++) {
				if(z%2==0) {
					System.out.print(startStrongGreen+"*"+endColor);
				}else {
					System.out.print(startStrongPink+"*"+endColor);
				}
			}
			System.out.println();
			blank--;
		}
		//生成树根
		for(int i=0;i<rootHeight;i++) {
			for(int j=0;j<height-3;j++) {
				System.out.print(" ");
			}
			System.out.println(startYellowBack+" ~ ~ "+endBack);
		}
	}
}