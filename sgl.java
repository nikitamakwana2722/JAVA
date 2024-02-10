class newSend 
{ 
    void sndMth()
    {
        System.out.println("NEW SEND CLASS");
    }
}
class Send extends newSend 
{
    void sndMth()
    {
        super.sndMth();
        System.out.println("SEND CLASS");
    }
}
class sgl extends Send 
{
    sgl()
    {
        super.sndMth();
        System.out.println("SINGLE CLASS");
    }
    public static void main(String s[])
    {
        sgl s1=new sgl();
    }
}