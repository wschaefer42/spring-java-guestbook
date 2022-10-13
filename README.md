# Guest Book Spring Sample

## Structure
````puml
@startuml
!theme vibrant
skinparam linetype ortho
left to right direction
frame  "Presentation Layer" {
class GuestBookView <<template>>
}
frame "Service Layer" {
class GuestBookResource
class GuestBookController
}
frame "Business Layer" {
class GuestService
}
frame "Persistent Layer" {
interface GuestRepository
entity Guest 
}
GuestRepository -> Guest
GuestService -> GuestRepository
GuestBookResource -> GuestService
GuestBookView -> GuestBookResource
GuestBookView <- GuestBookController
GuestBookResource -[hidden]-> GuestBookController
@enduml
````