package impannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Client {
    @Autowired
    private DataSourceBean dataSourceBean;

    public void showData() {
        System.out.println(dataSourceBean.getData());
    }
}
