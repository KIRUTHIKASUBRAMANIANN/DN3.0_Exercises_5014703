public class Main {
    public static void main(String[] args) {
        
        ProxyImage proxyImage = new ProxyImage("image1");

      
        proxyImage.display();

        
        ProxyImage anotherProxyImage = new ProxyImage("image2");

        
        anotherProxyImage.display();

        
        proxyImage.display();
    }
}