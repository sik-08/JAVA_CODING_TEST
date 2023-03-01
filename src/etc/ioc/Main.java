package etc.ioc;

public class Main {
    public static void main(String[] args) {
        String url = "www.naver.com/books/it?page=10";

        // Base 64 encoding
        // Base64Encoder encoder = new Base64Encoder();
        // IEncoder encoder = new Base64Encoder();

        // DI (의존 주입)
        Encoder encoder = new Encoder(new Base64Encoder());
        String result = encoder.encode(url);
        System.out.println(result);

        // URL encoding
        // UrlEncoder urlEncoder = new UrlEncoder();
        IEncoder urlEncoder = new UrlEncoder();
        String urlResult = urlEncoder.encode(url);
        System.out.println(urlResult);
    }
}
