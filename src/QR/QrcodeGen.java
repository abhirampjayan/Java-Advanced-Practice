package QR;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class QrcodeGen {
    public static void main(String[] args) throws Exception{
        String details = "abhirampjayan";
        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();
        File f =new File("F:\\Qr.png");
        FileOutputStream fos=new FileOutputStream(f);
        fos.write(out.toByteArray());
        fos.flush();

    }
}
