package com.pranay.blogapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pranay.blogapp.entities.Blog;
import com.pranay.blogapp.services.BlogServices;

@Controller
public class BlogController {

    @Autowired
    private BlogServices blogServices;

    @RequestMapping("/")
    public String homeBlog(Model model) {
        model.addAttribute("blogs", blogServices.getAllBlog());
        return "home";
    }

    @RequestMapping("/add")
    public String createBlog(Model model) {
        Blog blog = new Blog();
        model.addAttribute("blog", blog);
        return "createblog";
    }

    @RequestMapping("/addblog")
    public String getBlog(@ModelAttribute Blog blog) {
        System.out.println(blog.getBlogName());
        blogServices.saveBlog(blog);
        return "redirect:/";
    }

    @RequestMapping("/view/{id}")
    public String viewBlog(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogServices.findBlog(id));
        return "viewblog";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBlog(@PathVariable int id) {
        blogServices.deleteBlog(id);
        return "redirect:/";
    }

}
