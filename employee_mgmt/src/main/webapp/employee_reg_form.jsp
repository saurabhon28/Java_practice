<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
<style>
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
			<form method="post" action="/registerEmp">

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
									<option value="1">HR</option>
									<option value="2">IT</option>
									<option value="3">Finance</option>
							</select></td>
							<th>Designation</th>
							<td><select name="designation" class="form-select" required>
									<option value="">Select Designation</option>
									<option value="1">Manager</option>
									<option value="2">Engineer</option>
									<option value="3">Accountant</option>
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
							<td><input type="text" id="dependent" name="dependentName"
								class="form-control" required></td>
							<td><select id="relation" name="relation"
								class="form-select">
									<option value="mother">Mother</option>
									<option value="father">Father</option>
									<option value="brother">Brother</option>
							</select></td>
							<td><input type="text" id="aadhaar" name="aadhaar"
								class="form-control" required></td>
							<td>
								<button type="button" class="btn btn-success" id="addDetails">Add
									Details</button>
							</td>
						</tr>
					<tbody id="familyDetailsBody">
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
					<tr>
						<td colspan="4" class="text-center"><button type="submit"
								class="btn btn-primary">Register</button></td>
					</tr>
				</table>
			</form>
		</div>
	</main>
	<footer>
		<div class="container text-center mt-5">
			<p>&copy; 2023 Employee Management System. All rights reserved.</p>
		</div>
	</footer>
	<script>
		$(document)
				.ready(
						function() {
							$('#addDetails')
									.click(
											function() {
												var dependent = $('#dependent')
														.val();
												var relation = $('#relation')
														.val();
												var aadhaar = $('#aadhaar')
														.val();

												if (dependent != ''
														&& relation != ''
														&& aadhaar != '') {
													var markup = '<tr><td><input type="text" name="dependentName[]" class="form-control" value="' + dependent + '" readonly></td><td><input type="text" name="relation[]" class="form-control" value="' + relation + '" readonly></td><td><input type="text" name="aadhaar[]" class="form-control" value="' + aadhaar + '" readonly></td><td><button type="button" class="btn btn-danger remove">Remove</button></td></tr>';
													$('#familyDetailsBody')
															.append(markup);
													$('#dependent').val('');
													$('#aadhaar').val('');
												} else {
													alert('Please fill in all fields');
												}
											});

							$(document).on('click', '.remove', function() {
								$(this).closest('tr').remove();
							});
						});
	</script>
</body>
</html>
