package modul_6.praktikum_2.dengan_lsp;

public class TwitterPost implements Publishable{
    private static  final int MAX_LENGHT = 200;
    private String content;

    public TwitterPost(String content){
        this.content = content;
    }

@Override
public void publish() {
    if (!canPublish()) {
        throw new IllegalArgumentException("Tweet exceeds " + MAX_LENGHT + "charachters");
    }
    System.out.println("Posting tweet: "+ content);
}

@Override
public boolean canPublish(){
        return content.length()<= MAX_LENGHT;
}
@Override
    public int getMaxContentLenght(){
        return MAX_LENGHT;
}
}