package kr.co.chunjaeshop.seller.controller;

import kr.co.chunjaeshop.pagination.dto.PageDTO;
import kr.co.chunjaeshop.product.dto.ProductDTO;
import kr.co.chunjaeshop.product.service.ProductService;
import kr.co.chunjaeshop.seller.dto.SellerDTO;
import kr.co.chunjaeshop.seller.service.SellerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/seller")
@RequiredArgsConstructor
@Log4j2
public class SellerController {
    private final SellerService sellerService;
    private final ProductService productService;

    // 남원우


    // 최경락


    // 이무현


    // 유지호
    @GetMapping("/mySellerPage")
    public String mySellerInfoByIdx(@RequestParam("sellerIdx") Integer sellerIdx,

            /*@RequestParam("lastMonth") String lastMonth,*/
                                    Model model){
        log.info("sellerIdx = {}", sellerIdx);
        SellerDTO sellerDTO = sellerService.mySellerInfoByIdx(sellerIdx);
        int resultCnt = productService.countMyProductCnt(sellerIdx);
        int totalRev = sellerService.getMyTotalRev(sellerIdx);
        int getDateRev = sellerService.getDateRev(sellerIdx);
        int avgRev = sellerService.avgRev(sellerIdx);
        /*int getDateRevLast = sellerService.getDateRevLast(sellerIdx, lastMonth);*/
        model.addAttribute("myCount", resultCnt);
        model.addAttribute("mySeller", sellerDTO);
        model.addAttribute("myRev", totalRev);
        model.addAttribute("dateRev", getDateRev);
        model.addAttribute("avgRev", avgRev);
        model.addAttribute("sellerIdx", 1);
        /*model.addAttribute("lastDateRev", getDateRevLast);*/
        return "/seller/mySellerPage";
    }

    @GetMapping("/myProduct")
    public String myProductManage(@RequestParam("sellerIdx") Integer sellerIdx,
                                  @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                  @RequestParam(value = "searchField", required = false) String searchField,
                                  @RequestParam(value = "searchWord", required = false) String searchWord,
                                  Model model){
        List<ProductDTO> productPagingList = sellerService.productPagingListWithSearch(sellerIdx, page, searchField, searchWord);
        PageDTO sellProductPageDTO = sellerService.pagingParam(page, sellerIdx);
        PageDTO sellProductSearchPageDTO = sellerService.pagingSearchParam(page, sellerIdx, searchField, searchWord);
        model.addAttribute("myProductList", productPagingList);
        model.addAttribute("sellProductpaging", sellProductPageDTO);
        model.addAttribute("sellProductSearchPaging", sellProductSearchPageDTO);
        model.addAttribute("sellerIdx", 1);
        model.addAttribute("searchField", searchField);
        model.addAttribute("searchWord", searchWord);
        return "/seller/myProduct";
    }




    // 변재혁

}