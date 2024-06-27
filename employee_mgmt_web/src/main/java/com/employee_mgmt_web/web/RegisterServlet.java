package com.employee_mgmt_web.web;

import com.employee_mgmt_web.dao.EmployeeDependentDAO;
import com.employee_mgmt_web.dao.EmployeeMasterDAO;
import com.employee_mgmt_web.dao.EmployeePersonalDetailsDAO;
import com.employee_mgmt_web.model.EmployeeDependent;
import com.employee_mgmt_web.model.EmployeeMaster;
import com.employee_mgmt_web.model.EmployeePersonalDetails;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Personal details
        String fullName = request.getParameter("fullName");
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String department = request.getParameter("department");
        String designation = request.getParameter("designation");

        // Permanent address
        String permanentHouse = request.getParameter("permanentHouse");
        String permanentStreet = request.getParameter("permanentStreet");
        String permanentLandmark = request.getParameter("permanentLandmark");
        String permanentCity = request.getParameter("permanentCity");
        String permanentDistrict = request.getParameter("permanentDistrict");
        String permanentState = request.getParameter("permanentState");
        String permanentPin = request.getParameter("permanentPin");

        // Communication address
        String communicationHouse = request.getParameter("communicationHouse");
        String communicationStreet = request.getParameter("communicationStreet");
        String communicationLandmark = request.getParameter("communicationLandmark");
        String communicationCity = request.getParameter("communicationCity");
        String communicationDistrict = request.getParameter("communicationDistrict");
        String communicationState = request.getParameter("communicationState");
        String communicationPin = request.getParameter("communicationPin");

        // Family details
        String[] dependents = request.getParameterValues("dependent");
        String[] relations = request.getParameterValues("relation");
        String[] aadhaars = request.getParameterValues("aadhaar");

        // Create and save EmployeeMaster
        EmployeeMaster employeeMaster = new EmployeeMaster();
        employeeMaster.setEmployeeName(fullName);
        employeeMaster.setEmployeeFatherName(fatherName);
        employeeMaster.setCreatedDate(new Date());
        employeeMaster.setDeptId(Long.parseLong(department));
        employeeMaster.setDesignId(Long.parseLong(designation));
        // Set other employeeMaster fields as needed

        EmployeeMasterDAO employeeMasterDAO = new EmployeeMasterDAO();
        EmployeeMaster savedEmployee = employeeMasterDAO.saveEmployeeMaster(employeeMaster);

        // Create and save EmployeePersonalDetails
        EmployeePersonalDetails personalDetails = new EmployeePersonalDetails();
        personalDetails.setEmployeeMaster(savedEmployee);
        personalDetails.setFatherName(fatherName);
        personalDetails.setMotherName(motherName);
        personalDetails.setEmail(email);
        personalDetails.setPhone(phone);
        personalDetails.setGender(gender);
        personalDetails.setPermanentHouse(permanentHouse);
        personalDetails.setPermanentStreet(permanentStreet);
        personalDetails.setPermanentLandmark(permanentLandmark);
        personalDetails.setPermanentCity(permanentCity);
        personalDetails.setPermanentDistrict(permanentDistrict);
        personalDetails.setPermanentState(permanentState);
        personalDetails.setPermanentPin(permanentPin);
        personalDetails.setCommunicationHouse(communicationHouse);
        personalDetails.setCommunicationStreet(communicationStreet);
        personalDetails.setCommunicationLandmark(communicationLandmark);
        personalDetails.setCommunicationCity(communicationCity);
        personalDetails.setCommunicationDistrict(communicationDistrict);
        personalDetails.setCommunicationState(communicationState);
        personalDetails.setCommunicationPin(communicationPin);
        // Set other personalDetails fields as needed

        EmployeePersonalDetailsDAO personalDetailsDAO = new EmployeePersonalDetailsDAO();
        personalDetailsDAO.saveEmployeePersonalDetails(personalDetails);

        // Save family details
        if (dependents != null && relations != null && aadhaars != null) {
            for (int i = 0; i < dependents.length; i++) {
                EmployeeDependent dependent = new EmployeeDependent();
                dependent.setEmployeeMaster(savedEmployee);
                dependent.setDependentName(dependents[i]);
                dependent.setRelation(relations[i]);
                dependent.setAadhaarNo(aadhaars[i]);

                EmployeeDependentDAO dependentDAO = new EmployeeDependentDAO();
                dependentDAO.saveEmployeeDependent(dependent);
            }
        }

        response.sendRedirect("success.jsp");
    }
}