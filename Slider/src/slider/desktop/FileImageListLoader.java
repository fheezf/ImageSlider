package slider.desktop;

import java.io.File;
import java.io.FilenameFilter;
import slider.core.Image;
import slider.core.ImageList;
import slider.core.ImageListLoader;

public class FileImageListLoader extends ImageListLoader {
    
    private static FileImageListLoader instance = null;
    
    private FileImageListLoader() {
        
    }
    
    public static FileImageListLoader getInstance() {
        if (instance == null)
            instance = new FileImageListLoader();
        return instance;
    }

    @Override
    public ImageList load(String uri) {
        return readImages(readFilenames(uri), uri).link();
    }

    private ImageList readImages(String[] filenames, String uri) {
        ImageList imageList = new ImageList();
        for (String filename : filenames) {
            imageList.add(new Image(uri + "/" + filename, new AwtBitmapLoader()));
        }
        return imageList;
    }

    private String[] readFilenames(String uri) {
        File file = new File(uri);
        String[] names = file.list(getFilenameFilter());
        return names;
    }

    private FilenameFilter getFilenameFilter() {
        return new FilenameFilter() {

            @Override
            public boolean accept(File directory, String name) {
                final String[] extensions = {"jpg", "gif", "bmp", "png"};
                for (String extension : extensions) {
                    if (name.endsWith(extension)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }
}
