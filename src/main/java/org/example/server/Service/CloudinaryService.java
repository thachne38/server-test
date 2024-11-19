package org.example.server.Service;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Service
public class CloudinaryService {
    @Autowired
    private Cloudinary cloudinary;

    public Map<?,?> uploadFile(MultipartFile file) throws Exception {
        Map<?,?> uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
//        String imageUrl = uploadResult.get("url").toString();
//        String publicId = uploadResult.get("public_id").toString();
        return uploadResult;
    }
}
