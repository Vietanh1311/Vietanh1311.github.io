package com.example.bttuan2b2.controller;

import com.example.bttuan2b2.entities.studentEntity;
import com.example.bttuan2b2.model.student;
import com.example.bttuan2b2.repository.StudentRepository;
import com.example.bttuan2b2.service.studentService;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WedController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/upload")
    public String upload() {
       
        return "upload";
    }

    @GetMapping("/search")
    public ModelAndView  sreach(Model model) {
        ModelAndView mav = new ModelAndView("list-student");
        mav.addObject("student", studentRepository.findAll());
        return mav;
    }

    

    @GetMapping("/get-students")
    public List<student> GetStudents() {
        List<student> result = new ArrayList<>();
        List<studentEntity> entities = studentRepository.findAll();
        if (entities != null && entities.size() > 0) {
            entities.forEach(x -> {
                student item = new student();
                item.mahocsinh = x.mahocsinh;
                item.stt = x.stt;
                item.ten = x.ten;
                item.truonghoc = x.truonghoc;
                item.quanhuyen = x.quanhuyen;
                item.lop = x.lop;
                item.ngaysinh = x.ngaysinh;
                item.gioitinh = x.gioitinh;
                item.noisinh = x.noisinh;
                item.dantoc = x.dantoc;
                item.hokhau = x.hokhau;
                item.dienthoai = x.dienthoai;
                item.diem = x.diem;
                item.ghichu = x.ghichu;
                result.add(item);
            });
        }
        return result;
    }

    @PostMapping("/importOrderExcel")
    // @PostMapping("/add")
    public String importExcelFile(@RequestParam("excelFile") MultipartFile files, Model model) throws IOException {
        List<student> students = new ArrayList<>();
        XSSFWorkbook workbook = new XSSFWorkbook(files.getInputStream());
        // Read student data form excel file sheet1.
        XSSFSheet worksheet = workbook.getSheetAt(0);
        for (int index = 4; index < worksheet.getPhysicalNumberOfRows(); index++) {
            if (index > 4) {
                XSSFRow row = worksheet.getRow(index);
                student student = new student();
                student.stt = getCellValue(row, 0);
                student.truonghoc = getCellValue(row, 1);
                student.quanhuyen = getCellValue(row, 2);
                student.mahocsinh = getCellValue(row, 3);
                student.lop = getCellValue(row, 4);
                student.ten = getCellValue(row, 5);
                student.ngaysinh = getCellValue(row, 8);
                student.gioitinh = getCellValue(row, 9);
                student.noisinh = getCellValue(row, 10);
                student.dantoc = getCellValue(row, 11);
                student.hokhau = getCellValue(row, 12);
                student.dienthoai = getCellValue(row, 13);
                student.diem = getCellValue(row, 21);
                student.ghichu = getCellValue(row, 22);
                students.add(student);
            }
        }
        // Save to db.
        List<studentEntity> entities = new ArrayList<>();
        if (students.size() > 0) {
            students.forEach(x -> {
                studentEntity entity = new studentEntity();
                entity.mahocsinh = x.mahocsinh;
                entity.stt = x.stt;
                entity.ten = x.ten;
                entity.truonghoc = x.truonghoc;
                entity.quanhuyen = x.quanhuyen;
                entity.lop = x.lop;
                entity.ngaysinh = x.ngaysinh;
                entity.gioitinh = x.gioitinh;
                entity.noisinh = x.noisinh;
                entity.dantoc = x.dantoc;
                entity.hokhau = x.hokhau;
                entity.dienthoai = x.dienthoai;
                entity.diem = x.diem;
                entity.ghichu = x.ghichu;
                entities.add(entity);
                studentRepository.save(entity);
            });

        }
        model.addAttribute("students",students);
        return "search";
    }

    private int convertStringToInt(String str) {
        int result = 0;
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            return result;
        }
        result = Integer.parseInt(str);
        return result;
    }

    private String getCellValue(XSSFRow row, int cellNo) {
        DataFormatter formatter = new DataFormatter();
        Cell cell = row.getCell(cellNo);
        return formatter.formatCellValue(cell);
    }
    

}
