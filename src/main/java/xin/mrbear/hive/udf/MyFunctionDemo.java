package xin.mrbear.hive.udf;


import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class MyFunctionDemo extends UDF {
    //重载这个 不是重写的
    public Text evaluate(Text s){
        if(s==null){return null;}
        return new Text(s.toString().toLowerCase());
    }


    public int evaluate(int a, int b){
        return a+b;
    }
}
