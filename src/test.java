public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=crim();
		System.out.println(str);
	}
	public static String crim(){
		String str="";
		int trueThing=0;//������ʵ������
		String[] strArray={"A","B","C","D"};//����������
		/*
		 * �鿴5���¼�
		 * A������������(�¼�1)!A
		 * A����û��͵��ʯ(�¼�2)!A
		 * B:D�����ﷸ(�¼�3)D
		 * C:B���ﷸ���¼�4��B
		 * D��B�����ң��¼�5��!D
		 * ���¼����ñ�����ʽ���ֱ�ȡA��B,C,DΪ�ﷸ
		 * �����¼�ֻ��һ����˵�����滰
		 */
		for(int i=0;i<strArray.length;i++){
			trueThing= one(strArray[i])+two(strArray[i])+three(strArray[i])+four(strArray[i])+five(strArray[i]);
			if(trueThing==1){
				str+=strArray[i];
			}
		}
		return str;
	}
	public static int one(String str){//����ľ���1���ٵľ���0
		int i=0;
		if(str.equals("A")){
			i=0;
		}else{
			i=1;
		}
		return i;
	}
	public static int two(String str){//����ľ���1���ٵľ���0
		int i=0;
		if(str.equals("A")){
			i=0;
		}else{
			i=1;
		}
		return i;
	}
	public static int three(String str){//����ľ���1���ٵľ���0
		int i=0;
		if(str.equals("D")){
			i=1;
		}else{
			i=0;
		}
		return i;
	}
	public static int four(String str){//����ľ���1���ٵľ���0
		int i=0;
		if(str.equals("B")){
			i=1;
		}else{
			i=0;
		}
		return i;
	}
	public static int five(String str){//����ľ���1���ٵľ���0
		int i=0;
		if(str.equals("D")){
			i=0;
		}else{
			i=1;
		}
		return i;
	}
}
