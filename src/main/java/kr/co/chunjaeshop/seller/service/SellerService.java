package kr.co.chunjaeshop.seller.service;

import kr.co.chunjaeshop.pagination.dto.PageDTO;
import kr.co.chunjaeshop.product.dto.ProductDTO;
import kr.co.chunjaeshop.security.RegisterFormDTO;
import kr.co.chunjaeshop.seller.dto.SellerDTO;



import java.util.List;

public interface SellerService {
    // 남원우


    // 최경락


    // 이무현


    // 유지호
    SellerDTO mySellerInfoByIdx(Integer sellerIdx);

    int getMyTotalRev(Integer sellerIdx);

    int getDateRev(Integer sellerIdx);

    /*int getDateRevLast(Integer sellerIdx, String lastMonth);*/

    /*List<ProductDTO> myProduct(Integer sellerIdx);*/

    int avgRev(Integer sellerIdx);

    /*List<ProductDTO> productPagingList(Integer sellerIdx, int page);*/

    List<ProductDTO> productPagingList(Integer sellerIdx, int page);

    PageDTO pagingParam(int page, Integer sellerIdx);

    List<ProductDTO> productPagingListWithSearch(Integer sellerIdx, int page, String searchField, String searchWord);

    PageDTO pagingSearchParam(int page, Integer sellerIdx, String searchField, String searchWord);


    // 변재혁
    boolean sellerRegister(RegisterFormDTO registerFormDTO);
    boolean idDuplicationCheck(String id);


}