package com.github.cschen1205.tensorflow.web.controllers;

import com.github.cschen1205.tensorflow.web.models.PdfSearchEntry;
import com.github.cschen1205.tensorflow.web.services.SearchService;
import com.github.cschen1205.tensorflow.web.viewmodels.CountObj;
import com.github.cschen1205.tensorflow.web.viewmodels.PdfSearchQuery;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("Pdf Search")
@Controller
public class PdfSearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value="/api/search-pdf/count", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    CountObj getCount(@RequestBody PdfSearchQuery query) {
        long count = searchService.countByQuery(query.getKeyword(), query.getFilters());
        return new CountObj(count);
    }

    @RequestMapping(value="/api/search-pdf/page", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody
    List<PdfSearchEntry> getCount(@RequestParam("pageIndex") int pageIndex, @RequestParam("pageSize") int pageSize, @RequestBody PdfSearchQuery query) {
        List<PdfSearchEntry> result = searchService.pageByQuery(query.getKeyword(), query.getFilters(), pageIndex, pageSize, query.getSorting());
        return result;
    }
}
