package crawler.example.bdse07;

import com.github.abola.crawler.CrawlerPack;
import org.apache.commons.logging.impl.SimpleLog;

/**
 * 練習題：請使用 Google direction API (導航)功能，完成API call，以及印出 distance
 *git上傳查看檔案有點問題
 * 完成後同學請記得兩步動作上傳
 * 1. git > add
 * 2. git > commit file (一定要記得PUSH!!)
 */
public class ExamGoogleMapApi {

    public static void main(String[] args) {
        CrawlerPack.setLoggerLevel(SimpleLog.LOG_LEVEL_OFF);

        // 遠端資料路徑 (可先在postman 完成查詢，再貼上)
        String uri = "https://maps.googleapis.com/maps/api/directions/json?origin=25.060818,121.544128&destination=25.033762,121.543395&key=AIzaSyCE3rhrAg9_Nuxr1i-lfwTnbZ48ECkc-9c&mode=walk";

        // 完成下方 select 部份的內容，使其可取得 distance 的內容
        String distance =
            CrawlerPack.start()
                    .getFromJson(uri)
                    .select("legs > distance > text")
                    .text();

        System.out.println("result: " + distance);
    }
}
