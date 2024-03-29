USE [sundae]
GO
/****** Object:  Table [dbo].[Universidad]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Universidad](
	[idUniversidad] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[caller] [varchar](50) NOT NULL,
	[nro] [int] NOT NULL,
 CONSTRAINT [PK_Universidad] PRIMARY KEY CLUSTERED 
(
	[idUniversidad] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Universidad] ON
INSERT [dbo].[Universidad] ([idUniversidad], [nombre], [caller], [nro]) VALUES (1, N'UAI', N'Av San Juan', 960)
SET IDENTITY_INSERT [dbo].[Universidad] OFF
/****** Object:  Table [dbo].[Tipo_Usuario]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_Usuario](
	[idTipoUsuario] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Tipo_Usuario] PRIMARY KEY CLUSTERED 
(
	[idTipoUsuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Tipo_Usuario] ON
INSERT [dbo].[Tipo_Usuario] ([idTipoUsuario], [descripcion]) VALUES (1, N'Administrador')
INSERT [dbo].[Tipo_Usuario] ([idTipoUsuario], [descripcion]) VALUES (2, N'Estudiante')
SET IDENTITY_INSERT [dbo].[Tipo_Usuario] OFF
/****** Object:  Table [dbo].[Tipo_Cursada]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Tipo_Cursada](
	[idTipoCursada] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Tipo_Cursada] PRIMARY KEY CLUSTERED 
(
	[idTipoCursada] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Tipo_Cursada] ON
INSERT [dbo].[Tipo_Cursada] ([idTipoCursada], [descripcion]) VALUES (1, N'Cuatrimestral')
INSERT [dbo].[Tipo_Cursada] ([idTipoCursada], [descripcion]) VALUES (2, N'Verano')
SET IDENTITY_INSERT [dbo].[Tipo_Cursada] OFF
/****** Object:  Table [dbo].[Fecha]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Fecha](
	[idFecha] [int] IDENTITY(1,1) NOT NULL,
	[descripcion] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Fecha_1] PRIMARY KEY CLUSTERED 
(
	[idFecha] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Fecha] ON
INSERT [dbo].[Fecha] ([idFecha], [descripcion]) VALUES (1, N'Lunes')
INSERT [dbo].[Fecha] ([idFecha], [descripcion]) VALUES (2, N'Martes')
INSERT [dbo].[Fecha] ([idFecha], [descripcion]) VALUES (3, N'Miercoles')
INSERT [dbo].[Fecha] ([idFecha], [descripcion]) VALUES (4, N'Jueves')
INSERT [dbo].[Fecha] ([idFecha], [descripcion]) VALUES (5, N'Viernes')
INSERT [dbo].[Fecha] ([idFecha], [descripcion]) VALUES (6, N'Sabado')
INSERT [dbo].[Fecha] ([idFecha], [descripcion]) VALUES (7, N'Domingo')
SET IDENTITY_INSERT [dbo].[Fecha] OFF
/****** Object:  Table [dbo].[Usuario]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Usuario](
	[idUsuario] [int] IDENTITY(1,1) NOT NULL,
	[usuario] [varchar](50) NULL,
	[password] [varchar](50) NULL,
	[idTipoUsuario] [int] NULL,
 CONSTRAINT [PK_Usuario] PRIMARY KEY CLUSTERED 
(
	[idUsuario] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Usuario] ON
INSERT [dbo].[Usuario] ([idUsuario], [usuario], [password], [idTipoUsuario]) VALUES (1, N'jose', N'pepe', 2)
INSERT [dbo].[Usuario] ([idUsuario], [usuario], [password], [idTipoUsuario]) VALUES (2, N'admin', N'admin', 1)
SET IDENTITY_INSERT [dbo].[Usuario] OFF
/****** Object:  Table [dbo].[Carrera]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Carrera](
	[idCarrera] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[idUniversidad] [int] NOT NULL,
	[notaMinima] [int] NOT NULL,
	[cantidadMaxFinales] [int] NOT NULL,
	[asistenciaMin] [int] NOT NULL,
	[aniosMaxFinales] [int] NOT NULL,
 CONSTRAINT [PK_Carrera] PRIMARY KEY CLUSTERED 
(
	[idCarrera] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Carrera] ON
INSERT [dbo].[Carrera] ([idCarrera], [nombre], [idUniversidad], [notaMinima], [cantidadMaxFinales], [asistenciaMin], [aniosMaxFinales]) VALUES (1, N'Ing en Sistemas', 1, 4, 5, 75, 2)
SET IDENTITY_INSERT [dbo].[Carrera] OFF
/****** Object:  Table [dbo].[Plan]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Plan](
	[idPlan] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](50) NOT NULL,
	[idCarrera] [int] NOT NULL,
	[anioVigencia] [int] NOT NULL,
 CONSTRAINT [PK_Plan] PRIMARY KEY CLUSTERED 
(
	[idPlan] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Plan] ON
INSERT [dbo].[Plan] ([idPlan], [nombre], [idCarrera], [anioVigencia]) VALUES (1, N'109', 1, 2009)
SET IDENTITY_INSERT [dbo].[Plan] OFF
/****** Object:  Table [dbo].[Materia]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Materia](
	[idMateria] [int] IDENTITY(1,1) NOT NULL,
	[nombre] [varchar](100) NOT NULL,
	[idPlan] [int] NOT NULL,
 CONSTRAINT [PK_Materia] PRIMARY KEY CLUSTERED 
(
	[idMateria] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
SET IDENTITY_INSERT [dbo].[Materia] ON
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (1, N'Programacion Estructurada', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (2, N'Sistemas de Computacion 1', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (3, N'Laboratorio de calculo', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (4, N'Problematica del mundo actual', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (5, N'Ingles 1', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (6, N'Sistemas de computacion 2', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (7, N'Calculo infinitesimal', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (8, N'Historia de la ciencia y de la tecnica', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (9, N'Ingles 2', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (10, N'Programacion 1', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (11, N'Programacion Orientada a Objetos', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (12, N'Metdologias de desarrollo de sistemas 1', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (13, N'Calculo Infinitesimal', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (14, N'Ingles 3', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (15, N'Sistemas de representacion', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (16, N'Arquitectura de SO', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (17, N'Metodologias de desarrollo de sistemas 2', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (18, N'Fisica 1', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (19, N'Probabilidad y estadisticas', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (20, N'Ingles 4', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (21, N'Quimica', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (22, N'LUG', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (23, N'BD', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (24, N'Tecnologias de las comunicaciones', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (25, N'Optativa', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (26, N'Trabajo de Campo', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (27, N'Fisica 2', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (28, N'Teleinfo', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (29, N'Diploma', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (30, N'Analisis de procesos Administrativos', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (31, N'Discreta', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (32, N'BDA1', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (33, N'BDA2', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (34, N'SI', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (35, N'Org y Gest Emp', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (36, N'BD para la admin', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (37, N'LPPA', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (38, N'Adm de proy', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (39, N'Planificacion est', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (40, N'Adm Bancaria', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (41, N'Modelos', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (42, N'Electro 1', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (43, N'Sist de Hard para la adm', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (44, N'Seminario', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (45, N'Modelizacion Numerica', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (46, N'Electro 2', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (47, N'Practica Prof Sup', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (48, N'Auditoria Op', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (49, N'redes Adm', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (50, N'Teleprocesamiento avanzado', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (51, N'Seguridad Informatica', 1)
INSERT [dbo].[Materia] ([idMateria], [nombre], [idPlan]) VALUES (52, N'Trabajo final', 1)
SET IDENTITY_INSERT [dbo].[Materia] OFF
/****** Object:  Table [dbo].[Materia_Correlatividad]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Materia_Correlatividad](
	[idMateriaPrevia] [int] NOT NULL,
	[idMateriaPost] [int] NOT NULL,
 CONSTRAINT [PK_Materia_Correlatividad] PRIMARY KEY CLUSTERED 
(
	[idMateriaPrevia] ASC,
	[idMateriaPost] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (1, 10)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (2, 6)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (3, 7)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (4, 8)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (5, 9)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (6, 16)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (7, 13)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (7, 18)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (9, 14)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (10, 11)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (11, 22)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (12, 17)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (12, 23)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (13, 19)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (13, 31)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (14, 20)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (16, 24)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (17, 26)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (17, 30)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (17, 34)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (18, 27)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (18, 43)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (19, 45)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (22, 26)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (22, 37)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (23, 36)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (24, 28)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (26, 29)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (27, 42)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (28, 49)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (28, 50)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (29, 44)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (29, 47)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (35, 39)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (37, 41)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (37, 44)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (41, 44)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (42, 46)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (43, 51)
INSERT [dbo].[Materia_Correlatividad] ([idMateriaPrevia], [idMateriaPost]) VALUES (44, 52)
/****** Object:  Table [dbo].[Cursada]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cursada](
	[idCursada] [int] IDENTITY(1,1) NOT NULL,
	[idMateria] [int] NOT NULL,
	[idUsuario] [int] NOT NULL,
	[fechaInicioCursada] [date] NOT NULL,
	[idTipoCursada] [int] NOT NULL,
 CONSTRAINT [PK_Cursada] PRIMARY KEY CLUSTERED 
(
	[idCursada] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Examen]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Examen](
	[idExamen] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [date] NOT NULL,
	[nota] [date] NOT NULL,
	[tipoExamen] [int] NOT NULL,
	[idCursada] [int] NOT NULL,
 CONSTRAINT [PK_Examen] PRIMARY KEY CLUSTERED 
(
	[idExamen] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Fecha_Cursada]    Script Date: 02/15/2014 11:25:48 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Fecha_Cursada](
	[idFechaCursada] [int] IDENTITY(1,1) NOT NULL,
	[idDia] [int] NOT NULL,
	[horas] [int] NOT NULL,
	[idCursada] [int] NOT NULL,
 CONSTRAINT [PK_Fecha] PRIMARY KEY CLUSTERED 
(
	[idFechaCursada] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  ForeignKey [FK_Usuario_Tipo_Usuario]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Usuario]  WITH CHECK ADD  CONSTRAINT [FK_Usuario_Tipo_Usuario] FOREIGN KEY([idTipoUsuario])
REFERENCES [dbo].[Tipo_Usuario] ([idTipoUsuario])
GO
ALTER TABLE [dbo].[Usuario] CHECK CONSTRAINT [FK_Usuario_Tipo_Usuario]
GO
/****** Object:  ForeignKey [FK_Carrera_Universidad]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Carrera]  WITH CHECK ADD  CONSTRAINT [FK_Carrera_Universidad] FOREIGN KEY([idCarrera])
REFERENCES [dbo].[Universidad] ([idUniversidad])
GO
ALTER TABLE [dbo].[Carrera] CHECK CONSTRAINT [FK_Carrera_Universidad]
GO
/****** Object:  ForeignKey [FK_Plan_Carrera]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Plan]  WITH CHECK ADD  CONSTRAINT [FK_Plan_Carrera] FOREIGN KEY([idCarrera])
REFERENCES [dbo].[Carrera] ([idCarrera])
GO
ALTER TABLE [dbo].[Plan] CHECK CONSTRAINT [FK_Plan_Carrera]
GO
/****** Object:  ForeignKey [FK_Materia_Plan]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Materia]  WITH CHECK ADD  CONSTRAINT [FK_Materia_Plan] FOREIGN KEY([idPlan])
REFERENCES [dbo].[Plan] ([idPlan])
GO
ALTER TABLE [dbo].[Materia] CHECK CONSTRAINT [FK_Materia_Plan]
GO
/****** Object:  ForeignKey [FK_Materia_Correlatividad_Materia]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Materia_Correlatividad]  WITH CHECK ADD  CONSTRAINT [FK_Materia_Correlatividad_Materia] FOREIGN KEY([idMateriaPrevia])
REFERENCES [dbo].[Materia] ([idMateria])
GO
ALTER TABLE [dbo].[Materia_Correlatividad] CHECK CONSTRAINT [FK_Materia_Correlatividad_Materia]
GO
/****** Object:  ForeignKey [FK_Materia_Correlatividad_Materia1]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Materia_Correlatividad]  WITH CHECK ADD  CONSTRAINT [FK_Materia_Correlatividad_Materia1] FOREIGN KEY([idMateriaPost])
REFERENCES [dbo].[Materia] ([idMateria])
GO
ALTER TABLE [dbo].[Materia_Correlatividad] CHECK CONSTRAINT [FK_Materia_Correlatividad_Materia1]
GO
/****** Object:  ForeignKey [FK_Cursada_Materia]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Cursada_Materia] FOREIGN KEY([idMateria])
REFERENCES [dbo].[Materia] ([idMateria])
GO
ALTER TABLE [dbo].[Cursada] CHECK CONSTRAINT [FK_Cursada_Materia]
GO
/****** Object:  ForeignKey [FK_Cursada_Tipo_Cursada]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Cursada_Tipo_Cursada] FOREIGN KEY([idTipoCursada])
REFERENCES [dbo].[Tipo_Cursada] ([idTipoCursada])
GO
ALTER TABLE [dbo].[Cursada] CHECK CONSTRAINT [FK_Cursada_Tipo_Cursada]
GO
/****** Object:  ForeignKey [FK_Cursada_Usuario]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Cursada_Usuario] FOREIGN KEY([idUsuario])
REFERENCES [dbo].[Usuario] ([idUsuario])
GO
ALTER TABLE [dbo].[Cursada] CHECK CONSTRAINT [FK_Cursada_Usuario]
GO
/****** Object:  ForeignKey [FK_Examen_Cursada]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Examen]  WITH CHECK ADD  CONSTRAINT [FK_Examen_Cursada] FOREIGN KEY([idCursada])
REFERENCES [dbo].[Cursada] ([idCursada])
GO
ALTER TABLE [dbo].[Examen] CHECK CONSTRAINT [FK_Examen_Cursada]
GO
/****** Object:  ForeignKey [FK_Fecha_Cursada_Cursada]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Fecha_Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Fecha_Cursada_Cursada] FOREIGN KEY([idCursada])
REFERENCES [dbo].[Cursada] ([idCursada])
GO
ALTER TABLE [dbo].[Fecha_Cursada] CHECK CONSTRAINT [FK_Fecha_Cursada_Cursada]
GO
/****** Object:  ForeignKey [FK_Fecha_Cursada_Fecha]    Script Date: 02/15/2014 11:25:48 ******/
ALTER TABLE [dbo].[Fecha_Cursada]  WITH CHECK ADD  CONSTRAINT [FK_Fecha_Cursada_Fecha] FOREIGN KEY([idDia])
REFERENCES [dbo].[Fecha] ([idFecha])
GO
ALTER TABLE [dbo].[Fecha_Cursada] CHECK CONSTRAINT [FK_Fecha_Cursada_Fecha]
GO
