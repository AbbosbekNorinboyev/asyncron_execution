package uz.pdp.asyncronExecution;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.lang.ref.SoftReference;
import java.time.LocalDate;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class ReportSenderService {
    //    ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    @Async
    public void sendReport(String username) {
        try {
            TimeUnit.SECONDS.sleep(5);
            // Sent report to gmail
        } catch (Exception ignored) {
        }
        log.info("Report Sent !!!");
        throw new RuntimeException("Runtime Exception " + LocalDate.now());

//        new Thread(runnable).start();  // 1 - usul thread bilan ishlash
//        executorService.submit(runnable);  // 2 - usul thread bilan ishlash
//        CompletableFuture.runAsync(runnable);  // 3 - usul thread bilan ishlash
    }
}
