public class Song
{
    String title;
    String artist;
    String album;
    String year;
    
    public Song(String Title, String Artist, String Album, String Year)
    {
        this.title = Title;
        this.artist = Artist;
        this.album = Album;
        this.year = Year;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public String getAlbum(){
        return album;
    }
    
    public String getYear(){
        return year;
    }
    
    public String toString()
    {
        if (album.equals("none")){
            return "Artist: " + artist + "\nTitle: " + title + "\nNon-album single";
        }
        else{
            return "Artist: " + artist + "\nTitle: " + title + "\nAlbum: " + album;
        }
    }
}
