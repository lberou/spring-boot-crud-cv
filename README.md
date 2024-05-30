# Test POST request
send at ---> localhost:8085/api/v1/employee/
with Body:
```sh{
  "personalInformation": {
    "personalDetails": {
      "name": "nick",
      "middleName": "jason",
      "surname": "johnson",
      "email": "njohnson@mail.com",
      "birthDate": "1986-01-05"
    },
    "address": {
      "streetName": "Anafis",
      "number": 25,
      "postalCode": 32742,
      "city": "Volos",
      "country": "Greece"
    },
    "phoneNumbers": [
      {
        "number": "6977843346",
        "type": "mobile"
      }
    ]
  },
  "education": [
    {
      "title": "Softwareeee Engineer",
      "institution": "Volos University",
      "graduationDate": "2010-07-05"
    }
  ],
  "languages": [
    {
      "language": "Greek",
      "level": "native"
    }
  ],
  "workExperiences": [
    {
      "companyName": "Spotify",
      "position": "Software Enginner In Test",
      "startDate": "2018-07-05",
      "endDate": null,
      "description": "Working at Spotify"
    }
  ],
  "professionalSkills": [
    {
      "skill": "Java",
      "level": "3/5"
    }   
  ]
}
```
# Test PUT request
send at ---> localhost:8085/api/v1/employee/{id}
with Body:
```sh
{
  "workExperiences": [
    {
      "companyName": "Amazon",
      "position": "QA Engineer",
      "startDate": "2023-06-01",
      "endDate": "2023-12-31",
      "description": "QA engineer Tester at Amazon"
    }
  ]
}
```
OR
```sh
{
"languages": [
    {
      "language": "English",
      "level": "good"
    }
  ]
}
```
OR
```sh
{
"professionalSkills": [
        {
            "skill": "Python",
            "level": "1 / 5"
        }
    ]
}
```
OR
```sh
{
   "personalInformation": {
         "personalDetails": {
            "name": "Alexandros"
                }
  }
}
```

# Test GET all Employees request
send at ---> localhost:8085/api/v1/employee/

# Test GET Employee by id request
send at ---> localhost:8085/api/v1/employee/{id}

# Test DELETE Employee by id request
send at ---> localhost:8085/api/v1/employee/{id}
