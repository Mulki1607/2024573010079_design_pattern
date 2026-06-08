package modul_6.praktikum_2.tanpa_lsp;

public class TwitterPost extends SocialMediaPost{
    public TwitterPost(String content){
        super(content);
    }
    @Override
    public int calculateMaxCharachters(){
        return 280;
    }
    @Override
    public void publish(){
        if (content.length()>calculateMaxCharachters()){
            throw new IllegalArgumentException("Tweet melebihi batas karakter!");
        }
        System.out.println("Posting tweet: "+content);
    }
}
