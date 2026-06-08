package modul_6.praktikum_2.dengan_lsp;

public class SocialPost implements Publishable{
    protected String content;

    public SocialPost(String content){
        this.content = content;
    }

    @Override
    public void publish(){
        System.out.println("Punlishing: "+ content);
    }

    @Override
    public boolean canPublish(){
        return content.length()<=getMaxContentLenght();
    }

    @Override
    public int getMaxContentLenght(){
        return 1000;
    }
}
