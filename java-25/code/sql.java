import java.sql.DriverManager; 

class sql {
    public static void main(String[] data){
        Company c = new Company();
        c.show();
    }
}

class Company {
    void show() {
        String connectionString = "jdbc:mysql://127.0.0.1" + 
                        "/company?user=alice&password=1985-Alice";
        String driver = "com.mysql.cj.jdbc.Driver";
        String sql = "select * from staff";
        try {
            // 1. Start Driver
            // new com.mysql.cj.jdbc.Driver();
            Class.forName(driver);
            // 2. Get Connection
            var cn = DriverManager.getConnection(connectionString);
            // 3. PrePare Statement
            // PreparedStatement ps =cn.prepsreStatement(sql);
            var ps = cn.prepareStatement(sql);
            // 4. Query Data
            var rs = ps.executeQuery();
            // 5. Read each row
            while (rs.next()){
                String s = rs.getString("name");
                double v = rs.getDouble("salary");
                var d = rs.getDate("dob");
                System.out.println(s + " " + v + " " + d);
            }
            rs.close(); ps.close(); cn.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}