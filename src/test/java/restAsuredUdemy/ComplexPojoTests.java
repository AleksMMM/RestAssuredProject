package restAsuredUdemy;

import io.restassured.http.Header;
import org.junit.BeforeClass;
import org.junit.Test;
import restPojo.*;

import java.util.ArrayList;
import java.util.List;

public class ComplexPojoTests {

    @BeforeClass
    public void beforeClass() {

    }

    @Test
    public void complexPojoCreate() {
        HeaderItem headerItem = HeaderItem
                .builder()
                .key("Content-Type")
                .value("application/json")
                .build();

        List<HeaderItem> headerList = new ArrayList<>();
        headerList.add(headerItem);

        Body body = Body.builder()
                .raw("raw")
                .mode("{\\\"data\\\": \\\"123\\\"}")
                .build();

        Request request = Request.builder()
                .url("https://postman-echo/post")
                .method("POST")
                .header(headerList)
                .body(body)
                .description("This is a sample Post Request")
                .build();

        Info info = Info.builder()
                .name("Sample Collection 909")
                .schema("https://schema.getpostman.com/json/collection/v2.1.0/collection.json")
                .description("This is just a sample collection.")
                .build();

        ItemItem itemItem = ItemItem.builder()
                .name("This is a folder")
                .request(request)
                .item(i)
                .build();
    }

}
