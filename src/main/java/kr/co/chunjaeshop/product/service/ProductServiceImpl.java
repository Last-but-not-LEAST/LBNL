package kr.co.chunjaeshop.product.service;

import kr.co.chunjaeshop.product.dto.ProductDTO;
import kr.co.chunjaeshop.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Log4j2
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;




    // 남원우


    // 최경락
    @Override
    public int productSave(ProductDTO productDTO) {
        int saveResult = productRepository.productSave(productDTO);
        return saveResult;
    }


    public ProductDTO findByProductIdx(Integer sellerIdx, Integer productIdx) {

        return productRepository.findByProductIdx(sellerIdx, productIdx);
    }


    // 이무현


    // 유지호

    @Override
    public int countMyProductCnt(Integer sellerIdx) {
        int myCount = productRepository.countMyProductCnt(sellerIdx);
        return myCount;
    }

    // 변재혁

}
