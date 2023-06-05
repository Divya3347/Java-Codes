package extend_demo;

public class acd_data extends Name {
    int enrollno;
	int mobile;
    public int getenrollno(){
        return enrollno;
    }

    public void setenrollno(int i){
        this.enrollno = i;
    }

    public int getmobile(){
        return mobile;
    }

    public void setmobile(int j){
        this.mobile = j;
    }
}