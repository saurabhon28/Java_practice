<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration Form</title>
<link rel="stylesheet" href="css/bootstrap.css" />
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<style>
/* Ensure header and footer are fixed */
body {
	padding-top: 4.5rem;
	padding-bottom: 4.5rem;
}

.form-table {
	width: 100%;
}

.form-table th, .form-table td {
	padding: 10px;
}
</style>
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top">
			<div class="container-fluid">
				<a class="navbar-brand" href="#">Employee Management</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarColor01"
					aria-controls="navbarColor01" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarColor01">
					<ul class="navbar-nav me-auto">
						<li class="nav-item"><a class="nav-link active"
							href="index.jsp">Home <span class="visually-hidden">(current)</span>
						</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<h1 class="text-center mt-3">Employee Registration Form</h1>
		<div class="container">
			<form method="post" action="register">
				<table class="table table-bordered form-table">
					<tbody>
						<tr>
							<th colspan="4">PERSONAL DETAILS</th>
						</tr>
						<tr>
							<th>Full Name</th>
							<td colspan="3"><input type="text" name="fullName"
								class="form-control" required></td>
						</tr>
						<tr>
							<th>Father's Name</th>
							<td><input type="text" name="fatherName"
								class="form-control" required></td>
							<th>Mother's Name</th>
							<td><input type="text" name="motherName"
								class="form-control" required></td>
						</tr>
						<tr>
							<th>Email</th>
							<td><input type="email" name="email" class="form-control"
								required></td>
							<th>Phone Number</th>
							<td><input type="text" name="phone" class="form-control"
								required></td>
						</tr>
						<tr>
							<th>Gender</th>
							<td><select name="gender" class="form-select" required>
									<option value="male">Male</option>
									<option value="female">Female</option>
									<option value="other">Other</option>
							</select></td>
						</tr>
						<tr>
							<th>Department</th>
							<td><select name="department" class="form-select" required>
									<option value="">Select Department</option>
									<option value="HR">HR</option>
									<option value="IT">IT</option>
									<option value="Finance">Finance</option>
									<!-- Add more options as needed -->
							</select></td>
							<th>Designation</th>
							<td><select name="designation" class="form-select" required>
									<option value="">Select Designation</option>
									<option value="Manager">Manager</option>
									<option value="Engineer">Engineer</option>
									<option value="Accountant">Accountant</option>
									<!-- Add more options as needed -->
							</select></td>
						</tr>
						<tr>
							<th colspan="4">Family Details</th>
						</tr>
						<tr>
							<th>Name of Dependent</th>
							<th>Relation</th>
							<th>Aadhaar No.</th>
							<th>Action</th>
						</tr>
						<tr>
							<td><input type="text" id="dependent" class="form-control"
								required></td>
							<td><select id="relation" class="form-select">
									<option value="mother">Mother</option>
									<option value="father">Father</option>
									<option value="brother">Brother</option>
									<!-- Add more options as needed -->
							</select></td>
							<td><input type="text" id="aadhaar" class="form-control"
								required></td>
							<td>
								<button type="button" class="btn btn-success" id="addDetails">Add
									Details</button>
							</td>
						</tr>
					<tbody id="familyDetailsBody">
						<!-- This section will be dynamically populated with JavaScript -->
					</tbody>
					<tr>
						<th colspan="4">PERMANENT ADDRESS</th>
					</tr>
					<tr>
						<th>House No./ Bldg./Apt</th>
						<td><input type="text" name="permanentHouse"
							class="form-control" required></td>
						<th>Street/Road/Lane</th>
						<td><input type="text" name="permanentStreet"
							class="form-control" required></td>
					</tr>
					<tr>
						<th>Landmark</th>
						<td><input type="text" name="permanentLandmark"
							class="form-control" required></td>
						<th>Village/ Town/ City</th>
						<td><input type="text" name="permanentCity"
							class="form-control" required></td>
					</tr>
					<tr>
						<th>District</th>
						<td><input type="text" name="permanentDistrict"
							class="form-control" required></td>
						<th>State</th>
						<td><input type="text" name="permanentState"
							class="form-control" required></td>
					</tr>
					<tr>
						<th>Pin Code</th>
						<td><input type="text" name="permanentPin"
							class="form-control" required></td>
					</tr>
					<tr>
						<th colspan="4">COMMUNICATION ADDRESS</th>
					</tr>
					<tr>
						<th>House No./ Bldg./Apt</th>
						<td><input type="text" name="communicationHouse"
							class="form-control" required></td>
						<th>Street/Road/Lane</th>
						<td><input type="text" name="communicationStreet"
							class="form-control" required></td>
					</tr>
					<tr>
						<th>Landmark</th>
						<td><input type="text" name="communicationLandmark"
							class="form-control" required></td>
						<th>Village/ Town/ City</th>
						<td><input type="text" name="communicationCity"
							class="form-control" required></td>
					</tr>
					<tr>
						<th>District</th>
						<td><input type="text" name="communicationDistrict"
							class="form-control" required></td>
						<th>State</th>
						<td><input type="text" name="communicationState"
							class="form-control" required></td>
					</tr>
					<tr>
						<th>Pin Code</th>
						<td><input type="text" name="communicationPin"
							class="form-control" required></td>
					</tr>
					</tbody>


				</table>
				<div class="col-12 text-center mt-3">
					<button type="submit" class="btn btn-primary">Submit</button>
				</div>
			</form>
		</div>
	</main>
	<footer class="fixed-bottom bg-primary">
		<div class="container-fluid text-center py-3">
			<p class="mb-0">
				&copy;
				<%=java.time.LocalDate.now().getYear()%>
				Employee Management
			</p>
		</div>
	</footer>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script>
		document
				.addEventListener(
						'DOMContentLoaded',
						function() {
							document
									.getElementById('addDetails')
									.addEventListener(
											'click',
											function() {
												const dependent = document
														.getElementById('dependent').value;
												const relation = document
														.getElementById('relation').value;
												const aadhaar = document
														.getElementById('aadhaar').value;

												if (dependent && relation
														&& aadhaar) {
													var tbody = document
															.getElementById('familyDetailsBody');
													var newRow = document
															.createElement('tr');

													newRow.innerHTML = '<td>'
															+ dependent
															+ '</td>'
															+ '<td>'
															+ relation
															+ '</td>'
															+ '<td>'
															+ aadhaar
															+ '</td>'
															+ '<td>'
															+ '<button class="btn btn-primary btn-edit">Edit</button> '
															+ '<button class="btn btn-danger btn-delete">Delete</button>'
															+ '</td>';

													tbody.appendChild(newRow);

													// Clear the input fields
													document
															.getElementById('dependent').value = '';
													document
															.getElementById('relation').value = '';
													document
															.getElementById('aadhaar').value = '';
												} else {
													alert('Please fill all fields.');
												}
											});

							// Event delegation for dynamically added buttons
							document
									.getElementById('familyDetailsBody')
									.addEventListener(
											'click',
											function(event) {
												if (event.target.classList
														.contains('btn-delete')) {
													event.target.closest('tr')
															.remove();
												}

												if (event.target.classList
														.contains('btn-edit')) {
													const row = event.target
															.closest('tr');
													const cells = row
															.getElementsByTagName('td');

													document
															.getElementById('dependent').value = cells[0].innerText;
													document
															.getElementById('relation').value = cells[1].innerText;
													document
															.getElementById('aadhaar').value = cells[2].innerText;

													row.remove();
												}
											});
						});
	</script>
</body>
</html>
