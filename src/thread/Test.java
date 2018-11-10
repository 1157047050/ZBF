package thread;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class Test {
    /*public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册并加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //通过驱动管理器连接数据库
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/1512c","root","123456");
        //通过连接创建preparedstatement对象
        PreparedStatement ps = conn.prepareStatement("select * from student");
        //通过preparedstatement对象执行SQL语句
        ResultSet rs = ps.executeQuery();
        //遍历集合
        while (rs.next()){

        }
        rs.close();
        ps.close();
        conn.close();
    }*/
}
